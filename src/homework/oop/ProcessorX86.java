package homework.oop;

import static homework.oop.Constant.*;

public class ProcessorX86 extends Processor{

    private final String ARCHITECTURE = "X86";

    @Override
    public String getArchitecture() {
        return ARCHITECTURE;
    }

    public ProcessorX86(double frequency, double cache, int bitCapacity) {

        super(frequency, cache, bitCapacity);
    }

    @Override
    public String dataProcess(String data) {
        return String.format(PROCESSOR_USING, ARCHITECTURE, data).toLowerCase();
    }

    @Override
    public String dataProcess(long data) {
        return String.format(PROCESSOR_USING, ARCHITECTURE, data).toLowerCase();
    }

    @Override
    public String getDetails() {
        String result = super.getDetails();
        return result + ", architecture: " + ARCHITECTURE;
    }

    public class getArchitecture extends ProcessorX86 {
        public getArchitecture(double frequency, double cache, int bitCapacity) {
            super(frequency, cache, bitCapacity);
        }
    }
}
