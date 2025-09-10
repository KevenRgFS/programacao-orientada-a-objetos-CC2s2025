public class Computador 
{
    private Integer memoriaRAM;
    private Integer SSD;
    private Integer nucleos;
    private Double ope_por_seg;


    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleos, Double ope_por_seg)
    {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.ope_por_seg = ope_por_seg;
    }
    
    public Integer getMemoriaRAM()
    {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM)
    {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD()
    {
        return this.SSD;
    }

    public void setSSD(Integer SSD)
    {
        this.SSD = SSD;
    }

    public Integer getNucleos()
    {
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos)
    {
        this.nucleos = nucleos;
    }

    public Double getOpe_por_seg()
    {
        return this.ope_por_seg;
    }

    public void setOpe_por_seg(Double ope_por_seg)
    {
        this.ope_por_seg = ope_por_seg;
    }
}
