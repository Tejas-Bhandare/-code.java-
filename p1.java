public class p1 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int size = intervals.length;
        int finalIntervals [][] = new int[size][2];

        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        int mergeStart = 0;
        int mergeEnd = 0;

        int i = 0, j = 0;

        while(i < size)
        {
            if(newStart <= intervals[i][1])
            {
                mergeStart = intervals[i][0];
                j = i;
                while(i < size)
                {
                    if(newEnd == intervals[i][0] || newEnd <= intervals[i][1])
                    {
                        mergeEnd = intervals[i][1];
                        break;
                    }
                    else
                    {
                        i++;
                    }

                }
                
            }
            else
            {
                finalIntervals [i][0] = intervals[i][0];
                finalIntervals [i][1] = intervals[i][1];
                i++;
            }
                
        }
        return finalIntervals;


    }

    public static void main(String[] args) {

        int n = 6;
        int[][] intervals = new int [6][2];

        
        
    }
    
}
