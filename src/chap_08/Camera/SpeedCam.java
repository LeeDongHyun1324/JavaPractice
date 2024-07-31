package chap_08.Camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;


public class SpeedCam extends Camera implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reportor;

    public void setDetector(Detectable detect) {
        this.detector = detect;
    }
    public void setReporter(Reportable report) {
        this.reportor = report;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect(){
        this.detector.detect();
    }
    public void report(){
        this.reportor.report();
    }

}
