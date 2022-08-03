public class Para {
    private String text;

    public Para() {
    }

    public Para(String text) {
        this.text = text;
    }

    public int count(){
        return standard().split("\\s").length;
    }

    public long countA(){
        return this.text.chars().filter(c -> c=='a' || c=='A').count();
    }

    public String standard(){
        String str = this.text.trim();
        str = str.replaceAll("\\s+"," ");
        return str;
    }

    @Override
    public String toString() {
        return "Para{" +
                "text='" + text + '\'' +
                '}';
    }
}
