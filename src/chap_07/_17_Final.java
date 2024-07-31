package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;
import com.sun.corba.se.impl.interceptors.SlotTable;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        //public (final) class...
        //public (final) void...
        //public > abstract > static > final > ...
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("=================================");
        SlowActionCam slowActionCam = new SlowActionCam();

        slowActionCam.makeVideo();
    }
}
