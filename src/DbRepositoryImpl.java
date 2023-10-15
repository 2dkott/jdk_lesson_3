import java.util.ArrayList;
import java.util.List;

public class DbRepositoryImpl implements DbRepository{

    private List<Record> dbRecords = new ArrayList<>();
    private int count;

    {
        count+=1;
    }

    @Override
    public List<Record> getAll() {
        return dbRecords;
    }

    @Override
    public Record getById(int id) {
        return dbRecords.stream().filter(record -> record.getId() == id).findFirst().orElseThrow();
    }

    @Override
    public int create(Record record) {
        record.setId(count);
        dbRecords.add(record);
        return record.getId();
    }

    @Override
    public void update(Record record) {
        Record existRecord = dbRecords.stream().filter(rec -> rec.getId() == record.getId()).findFirst().orElseThrow();
        dbRecords.remove(existRecord);
        dbRecords.add(record);
    }

    @Override
    public void delete(int id) {
        Record existRecord = dbRecords.stream().filter(rec -> rec.getId() == id).findFirst().orElseThrow();
        dbRecords.remove(existRecord);
    }
}
