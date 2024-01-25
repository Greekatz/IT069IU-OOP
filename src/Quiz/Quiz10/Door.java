package Quiz.Quiz10;

public class Door {
    private Boolean isOpen = false;
    public void close() {
        System.out.println("Close");
        isOpen = false;
    }

    public void open() {
        System.out.println("Open");
        isOpen = true;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

}
