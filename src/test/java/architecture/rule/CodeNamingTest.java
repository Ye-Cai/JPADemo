package architecture.rule;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeArchives;
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeJars;
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeTests;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.ftms", importOptions = {DoNotIncludeJars.class, DoNotIncludeTests.class,
        DoNotIncludeArchives.class})
class CodeNamingTest {


    @ArchTest
    void should_resideIn_dto_package_when_classes_suffix_name_is_DTO(JavaClasses classes) {
        classes().that()
                 .haveSimpleNameEndingWith("DTO")
                 .should()
                 .resideInAPackage("..dtos..").check(classes);
    }

    @ArchTest
    void should_naming_DTO_when_class_reside_in_dto_package(JavaClasses classes) {
        classes()
                .that()
                .resideInAPackage("..dtos..")
                .should()
                .haveNameMatching(".*DTO(Builder)?\\$?.*")
                .check(classes);
    }

    @ArchTest
    void should_resideIn_response_package_when_classes_suffix_name_is_response(JavaClasses classes) {
        classes().that()
                 .haveSimpleNameEndingWith("Response")
                 .should()
                 .resideInAPackage("..response..")
                 .check(classes);
    }

    @ArchTest
    void should_resideIn_request_package_when_classes_suffix_name_is_request(JavaClasses classes) {
        classes().that()
                 .haveSimpleNameEndingWith("Request")
                 .should()
                 .resideInAPackage("..request..")
                 .check(classes);
    }


}
