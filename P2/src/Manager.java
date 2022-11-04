class Manager extends Employee {
    int incentives = 1000;

    public Manager() {
        super();
    }

    public int TotalSalary() {
        return super.TotalSalary + incentives;

    }
}