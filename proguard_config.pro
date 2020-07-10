


-dontshrink
-dontoptimize
-flattenpackagehierarchy ''
-keepattributes *Annotation*  # Exceptions,InnerClasses,Signature,Deprecated,SourceFile,LineNumberTable,LocalVariable*Table,*Annotation*,Synthetic,EnclosingMethod
-adaptresourcefilecontents **.fxml,**.properties,META-INF/MANIFEST.MF

-keepclassmembernames class * {
    @javafx.fxml.FXML *;
}


# Keep - Applications. Keep all application classes, along with their 'main'
# methods.
-keepclasseswithmembers public class org.example.Launcher {
    public static void main(java.lang.String[]);
}

