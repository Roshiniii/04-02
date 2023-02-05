    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
            List<Integer> finalGrading =new ArrayList<>();
            for(int grade : grades){
            if(grade < 38){
                finalGrading.add(grade);
            }
            else if(grade%5 > 2){
                grade = grade + 5 - ( grade % 5 );
                finalGrading.add(grade);
            }
            else{
                finalGrading.add(grade);
            }
        }
        return finalGrading;
}
