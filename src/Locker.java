import java.io.*;
import java.util.*;
public class Locker {
public static void main(String[] args) throws IOException {

int choice=-1,choice2 = -1;
Scanner sc = new Scanner(System.in);

System.out.println("Project Name : Virtual Key for Your Repositories");
System.out.println("Developer Name : Shubham Singhal");

do {
System.out.println("Enter your Choice");
System.out.println("choice 1: Display file list in the folder. ");
System.out.println("choice 2: Create new file and Delete file");
System.out.println("choice 3: Search file in folder");
System.out.println("choice 0: Exit the Program");
choice = sc.nextInt();

File f1 = new File("C:\\Users\\shubh\\Desktop\\New folder\\abc.txt");
File directory = new File("C:\\Users\\shubh\\Desktop\\New folder\\");
String flist[] = directory.list();

switch (choice) {
case 1:

int filecount=0;

for (int i=0; i<flist.length; i++)
{
String filename = flist[i];
System.out.println(filename);
filecount=i+1;
}

System.out.println("Total file = "+filecount);
break;
case 2:
do {
System.out.println("choice 1: Create new file");
System.out.println("choice 2: Delete the file");
System.out.println("choice 0: Exit from here ");

choice2 = sc.nextInt();
switch (choice2) {
case 1:

f1.createNewFile();
System.out.println("file create sucessfully=" + f1.getName());
break;
case 2:
System.out.println("Enter file name to delete");

Scanner sc1 = new Scanner(System.in);

String f2 = sc1.nextLine();
File f3 = new File(f2);
int flag1 = 0;
if (flist == null) {
System.out.println("Empty directory");
} else {

for (int i = 0; i < flist.length; i++) {
String filename = flist[i];

if (filename.equalsIgnoreCase(f2)) {
f1.delete();
System.out.println(filename + "found");
System.out.println("Deleted this file successfully="+filename);
flag1 = 1;
}
}
}
if (flag1 == 0) {
System.out.println("File Not Found");
}
break;
case 0:
System.out.println("Exit from here");
break;

default:
System.out.println("select write choice");
}
}while(choice2 != 0);
break;
case 3:
System.out.println("Enter file name to search");

Scanner sc2 = new Scanner(System.in);

String f4 = sc2.nextLine();
int flag = 0;
if (flist == null) {
System.out.println("Empty directory.");
} else {

for (int i = 0; i < flist.length; i++) {
String filename = flist[i];

if (filename.equalsIgnoreCase(f4)){
System.out.println(filename + " found");
flag = 1;
}
}
}
if (flag == 0) {
System.out.println("File Not Found");
}
break;
case 0:
System.out.println("Exit the Program");
break;
default:
System.out.println("select right choice");
}
} while (choice != 0);
}
}