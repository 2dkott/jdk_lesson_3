public class Main {
    public static void main(String[] args) {

        DbRepository repository = new DbRepositoryImpl();

        Record record1 = new Record().setValue("Test");
        System.out.println("Create record:");
        record1.setId(repository.create(new Record().setValue("Test")));

        System.out.println("Show all records:");
        System.out.println(repository.getAll());


        record1.setValue("Updated Test");
        repository.update(record1);
        System.out.println("Check update of record1:");
        System.out.println(repository.getById(record1.getId()));

        System.out.println("Delete record1:");
        repository.delete(record1.getId());
        System.out.println(repository.getAll());
    }
}