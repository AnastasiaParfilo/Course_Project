package ua.com.khai;

public class Warehouse extends Building{
    private Integer boxWithFood;
    private Integer boxWithTools;
    private Integer boxWithAppliances;
    private Double area;

    public boolean hasFreePlace(){
        Double areaBoxWithFood = 21.8;
        Double areaBoxWithTools = 72.3;
        Double areaBoxWithAppliances = 56.5;
        return (getArea() - (areaBoxWithAppliances + areaBoxWithTools + areaBoxWithFood)) > 0;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public boolean isEmpty(){
        return boxWithFood == 0 && boxWithAppliances == 0 && boxWithTools == 0;
    }

    public Integer getBoxWithAppliances() {
        return boxWithAppliances;
    }

    public void setBoxWithAppliances(Integer boxWithAppliances) {
        this.boxWithAppliances = boxWithAppliances;
    }

    public Integer getBoxWithFood() {
        return boxWithFood;
    }

    public void setBoxWithFood(Integer boxWithFood) {
        this.boxWithFood = boxWithFood;
    }

    public Integer getBoxWithTools() {
        return boxWithTools;
    }

    public void setBoxWithTools(Integer boxWithTools) {
        this.boxWithTools = boxWithTools;
    }
}
