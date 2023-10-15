import java.util.List;

public interface DbRepository {
    List<Record> getAll();
    Record getById(int id);
    int create(Record record);
    void update(Record record);
    void delete(int id);
}
