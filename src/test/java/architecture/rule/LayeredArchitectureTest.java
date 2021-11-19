package architecture.rule;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchIgnore;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.ftms")
public class LayeredArchitectureTest {
    @ArchTest
    @ArchIgnore(reason = "初始化项目没有代码，有了代码放开ignore")
    public static final ArchRule LAYER_ARCHITECTURE_RULE =
            layeredArchitecture()
                    .layer("Representation").definedBy("..representation..")
                    .layer("Application").definedBy("..application..")
                    .layer("Infrastructure").definedBy("..infrastructure..")
                    .layer("Domain").definedBy("..domain..")
                    .whereLayer("Representation").mayNotBeAccessedByAnyLayer()
                    .whereLayer("Application").mayOnlyBeAccessedByLayers("Representation")
                    .whereLayer("Infrastructure").mayOnlyBeAccessedByLayers("Application")
                    .whereLayer("Domain").mayOnlyBeAccessedByLayers("Representation", "Application", "Infrastructure");


}
