public class Author {

    public static final int DEFAULT_YEAR = AuthorBookConstants.UNKNOWN_YEAR;

    // Instance variables
    private String givenName;
    private String surname;
    private int birthYear = DEFAULT_YEAR;
    private int deathYear = DEFAULT_YEAR;

    // class variables
    public static int validYearStart = -2000;
    public static int validYearEnd = 2024;

    // Constructor
    public Author(String givenName, String surname) {
        Author j = AuthorBookConstants.UNKNOWN_AUTHOR;
        if(givenName.equals("")) {
            this.givenName = j.givenName;
        }else if(surname.equals("")){
            this.surname = j.surname;
            this.givenName = givenName;
        }else{
            this.givenName = givenName;
            this.surname = surname;
        }
    }

    // Getters
    public int getBirthYear(){
        return birthYear;
    }

    public int getDeathYear(){
        return deathYear;
    }

    // Setters

    /**
     * Set the birth year of the Author.
     * @param birth - Must be a valid year.
     */
    public void setLifeRange(int birth){
        if(birth < validYearStart || birth > validYearEnd){
            System.out.println(" Birth year not valid");
        }else{
            this.birthYear = birth;
        }
    }

    /**
     * Set the birth year and death year for an author.
     * Assumes that both dates are valid and birth comes before death.
     * @param birth - Year of author's birth
     * @param death - Year of author's death
     */
    public void setLifeRange(int birth, int death){
        this.birthYear = DEFAULT_YEAR;
        this.deathYear = DEFAULT_YEAR;
        if(birth <= validYearStart || death >= validYearEnd || birth > death){
            System.out.println(" Birth year or death year are not valid years.");
        }else{
            this.birthYear = birth;
            this.deathYear = death;
        }
    }

    public boolean hasSameName(Author other){
        //TODO: if authors have same name return true else false
        // return true is first intial and surname match.
        return false;
    }

    public String toString(){
        String proper = "";
        proper += surname + ", " + givenName;
        return proper;
    }

    public String getInfoString(){
        String information = "";
        if(deathYear == DEFAULT_YEAR && this.birthYear == DEFAULT_YEAR) {
            information = toString();
        }else if(deathYear == DEFAULT_YEAR){
            information = toString() + " (born, " + birthYear + ")";
        }else{
            information = toString()+" ("+ birthYear + "-" + deathYear+")";
        }
        return information;
    }

    public static void main(String[] args){
        Author a = new Author("Steven","Archuleta");
        Author b = new Author("","");
        a.setLifeRange(1999,2010);
        System.out.println(a.toString());
        System.out.println(a.getInfoString());
        System.out.println(b.getDeathYear());

        Author c = new Author("Fart","" );
        c.setLifeRange(1996);
        System.out.println(c.getInfoString());
    }
}
