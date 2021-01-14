package sample;

public abstract class General {
    protected String name;
    public void saidName() {
        System.out.println(name);
    }
}

class OrkGeneral extends General{
    public OrkGeneral() {
        this.name = "Ork General";
    }
}

class  ElfGeneral extends General{
    public ElfGeneral() {
        this.name = "Elf General";
    }
}
