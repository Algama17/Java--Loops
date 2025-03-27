package alberto.java_loops;

public class MultiplicationTable {
    public String[] generateTable(int n) {
        String[] table = new String[10];
        for (int i = 1; i <= 10; i++){
            int result = n * i;
            table[i - 1] = n + " x " + i+ " = " + result;
        }
        return table;
    }
}
