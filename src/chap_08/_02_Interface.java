package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.detector.AdvencedFirDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("====================================");
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvencedFirDetector();
        advancedFireDetector.detect();

        System.out.println("=================================");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
