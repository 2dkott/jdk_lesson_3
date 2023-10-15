public class Record {
    private int id;
    private String value;

    public int getId() {
        return id;
    }

    public Record setId(int id) {
        this.id = id;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Record setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Record: %s; id: %s", value, id);
    }
}
