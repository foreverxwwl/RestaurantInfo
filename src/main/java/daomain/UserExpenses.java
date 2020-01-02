package daomain;

import java.util.List;

/**
 * @outhor li
 * @create 2020-01-02 9:48
 */
public class UserExpenses {
    private String sname;
    private String snum;
    private String emsg;

    public String getEmsg() {
        return emsg;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }


    @Override
    public String toString() {
        return "UserExpenses{" +
                "sname='" + sname + '\'' +
                ", snum='" + snum + '\'' +
                ", emsg='" + emsg + '\'' +
                '}';
    }
}
