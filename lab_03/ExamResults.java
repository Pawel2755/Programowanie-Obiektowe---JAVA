public class ExamResults {
    private int[] points;


    public ExamResults(int[] points){
        if(points !=null){
            this.points = points.clone();
        }
        else {
            this.points = new int[0];
        }
    }



    public int[] getPoints(){
        return this.points.clone();
    }
}