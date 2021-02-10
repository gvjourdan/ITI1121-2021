public class Account {
    private int id;
    private String name;

    public Account( int id, String name ) {
        this.id = id;
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

/*
    public boolean equals( Account other) {
        return id == other.id && name.equals(other.name);
    }
*/
    public boolean equals(Object o){
        
        if(o == null) {
            return false;
        }

        if(getClass() != o.getClass()) {
            return false;
        }

        Account other = (Account)o;

        if(id != other.id) {
            return false;
        } 
        if(name == null) {
            return other.name == null;
        } else {
            return name.equals(other.name);
        }
    }
}
