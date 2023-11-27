class Test29 {
public static void main(String[] args) {
int[][] myNumbers = { {1,2,3,4}, {5,6,7,8,9,10} };
for (int i = 1; i < myNumbers.length; ++i) {
for(int j = 2; j < myNumbers[i].length; ++j) {
System.out.println(myNumbers[i][j]);
}
}
}
}