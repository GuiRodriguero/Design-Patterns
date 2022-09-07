package br.com.ex1;

public class Report {

    private String name;
    private String permission;

    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
