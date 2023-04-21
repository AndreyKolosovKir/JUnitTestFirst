public class Sort {
    protected int n = 10;

    public int[] merge(int[] first, int[] second) {
        int iA = 0;
        int iB = 0;
        int iC = 0;
        int[] finalTeam = new int[n];
        while (iA < first.length || iB < second.length) {
            if (iC == n) {
                return finalTeam;
            }
            if (iA == first.length) {
                finalTeam[iC] = second[iB];
                iB += 1;
            } else if (iB == second.length) {
                finalTeam[iC] = first[iA];
                iA += 1;
            } else {
                if (first[iA] >= second[iB]) {
                    finalTeam[iC] = first[iA];
                    iA += 1;
                    iC += 1;
                } else {
                    finalTeam[iC] = second[iB];
                    iB += 1;
                    iC += 1;
                }
            }
        }
        return finalTeam;
    }

    public int[] nationalTeam(int[][] regionalTeam) {
        int[] team;
        if (regionalTeam[0].length < n) {
            team = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            for (int k = 0; k < regionalTeam[0].length; k++) {
                team[k] = regionalTeam[0][k];
            }

            for (int i = 1; i < regionalTeam.length; i++) {
                team = merge(team, regionalTeam[i]);
            }
        } else {
            team = regionalTeam[0];
            for (int i = 1; i < regionalTeam.length; i++) {
                team = merge(team, regionalTeam[i]);
            }
        }
        return team;

    }
}
