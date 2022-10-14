package Seven_practice.fifthSixthTask;

public class ProcessStrings implements Strings{
    private String string;

    public ProcessStrings(String string) {
        this.string = string;
    }

    @Override
    public int count() {
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            count++;
        }
        return count;
    }

    @Override
    public String uneven() {
        String string1 = "";
        for (int i = 0; i < string.length(); i++){
            if(i % 2 == 0)
                string1 += string.charAt(i);
        }
        return string1;
    }

    @Override
    public String inversion() {
        String string2 = "";
        //i = длине строки - 1
        for(int i = (string.length() - 1); i >= 0; i--){
            string2 += string.charAt(i);
        }
        return string2;
    }
}
