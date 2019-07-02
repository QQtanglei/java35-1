//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zuoye;

import java.util.Objects;

class Method {
    private String name;
    private long runTime;
    private long conut;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRunTime() {
        return this.runTime;
    }

    public void setRunTime(long runTime) {
        this.runTime = runTime;
    }

    public long getConut() {
        return this.conut;
    }

    public void setConut(long conut) {
        this.conut = conut;
    }

    public Method() {
    }

    public Method(String name, long runTime, long conut) {
        this.name = name;
        this.runTime = runTime;
        this.conut = conut;
    }

    public String toString() {
        return "method{name='" + this.name + '\'' + ", runTime=" + this.runTime + ", conut=" + this.conut + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Method method = (Method)o;
            return this.runTime == method.runTime && this.conut == method.conut && Objects.equals(this.name, method.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.runTime, this.conut});
    }
}
