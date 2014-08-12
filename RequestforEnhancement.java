/**
* Describes the Request-for-Enhancement (RFE) annotation type.
*/
public @interface RequestforEnhancement
{
int id;
String synopsis();
String engineer() default "[unassigned]";
String date() default "[unknown]";

}
