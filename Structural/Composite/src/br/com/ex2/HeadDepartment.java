package br.com.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite do UML
 */
public class HeadDepartment implements Department{

    private Integer id;
    private String name;

    private List<Department> childs;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childs = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childs.forEach(Department::printDepartmentName);
    }

    //Difernte do ex1, deixamos esses métodos somente no Composite
    public void addDepartment(Department department) {
        childs.add(department);
    }

    public List<Department> getChilds(){
        return childs;
    }

    public Integer getChildsNumber(){
        return childs.size();
    }

    public void removeDepartment(Department department) {
        childs.remove(department);
    }
}
