class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = 0;
        int sortIdx = 0;

        if (ext.equals("code")) extIdx = 0;
        else if (ext.equals("date")) extIdx = 1;
        else if (ext.equals("maximum")) extIdx = 2;
        else if (ext.equals("remain")) extIdx = 3;

        if (sort_by.equals("code")) sortIdx = 0;
        else if (sort_by.equals("date")) sortIdx = 1;
        else if (sort_by.equals("maximum")) sortIdx = 2;
        else if (sort_by.equals("remain")) sortIdx = 3;

        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIdx] < val_ext) count++;
        }

        int[][] temp = new int[count][4];
        int idx = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIdx] < val_ext) {
                for (int j = 0; j < 4; j++) {
                    temp[idx][j] = data[i][j];
                }
                idx++;
            }
        }

        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i][sortIdx] > temp[j][sortIdx]) {
                    int[] t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }

        return temp;
    }
}