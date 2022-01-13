package lesson;

public class Notebook extends Computer{
    private int baterryCapacity;

    public Notebook(double cpuTemperature, int ramMemory, int baterryCapacity) {
        super(cpuTemperature, ramMemory);
        this.baterryCapacity = baterryCapacity;
    }

    public int getBaterryCapacity() {
        return baterryCapacity;
    }

    public void setBaterryCapacity(int baterryCapacity) {
        this.baterryCapacity = baterryCapacity;
    }

    @Override
    public void coolDown() {
        turboCool();
    }

    private void turboCool() {
        setCpuTemperature(getCpuTemperature() - 2);
    }
}
