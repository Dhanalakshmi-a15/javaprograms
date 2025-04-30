//control statement
//contol statement is a is a statement a code or excuted according to the day apear
/*decision making  statement
 *  if statement(if,if-else,if-else-if,nested-if ladder);
 *  if (condition)
 *  {
 *  statement//excutes when the comdition is ture
 *  }
 *  Switch statement
 *  2.loop statement
 *  do while
 *  while
 *  for
 *  for -each
 *  3.jumb statements
 *  break
 *  continue
 *  in nested if satement in if statement contain if or if else inside anther if all else if satement
 */

package NewPackage;

public class Program {
	public static void main(String[] args) { 
	//if condition if condition the condition is ture excuted the if block of the code
	int a=5;
			int b=22;
	if(a+b>20)
	{
		System.out.println("The value of x& y is greatre than");
	}
	//if else else condition  the condition is false excuted the else block of the code
	int r=5;
	int s=22;
if(r+s>20)
{
System.out.println("The value of x& y is greatre than");
}
else
{
	System.out.println("the value is lessthan 20");
}
//else if condition when the ture excuted the else if blockof the code
int h=5;
int f=2;
int e=2;
if(h>f && h>e)
{
System.out.println("The value of x& y is greatre than");
}
else if(f>e && f>h) {
	System.out.println("e is a greaterthan");
}
else {
	System.out.println("h is lessthan");
}
//Nested if
int x=20;
int y=10;
if(x<20)
{
    System.out.println("x<30");
	    if(y>8) {
		  System.out.println("y>8");
	     }
}
else {
	System.out.println("x is not<30& y>8");
}
/*Switch (Expresion){
 * case value1;
 * statemnt1;
 * break;.....
 * case valueN
 * StatementN;
 * break;
 * default;
 * defalut statemnt;
 * }
 * 
 * 
 * 
 */
int num=3;
switch(num) {
case 0:
{
System.out.println("the value is zero");	
}
case 1:{
	System.out.println("the value is one");
}
case 2:
{
	System.out.println("the value is two");
}
break;
default:
{
	System.out.println(num);
}
}

}
}
