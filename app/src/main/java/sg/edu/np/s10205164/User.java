package sg.edu.np.s10205164;

public class User{
    String name;
    String description;
    int id;
    boolean followed;

    public User(){}

    public User(String name, String description, int id, boolean followed){
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    public void ToggleFollow(){
        followed = !followed;
    }

    public boolean isFollowed(){
        return followed;
    }
}
