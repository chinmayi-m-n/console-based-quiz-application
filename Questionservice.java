import java.util.*;
public class Questionservice{
    
    Question[] questions=new Question[5];
    String[] selection=new  String[5];
    
    public Questionservice(){
        questions[0]=new Question(1, "what is language invented in 1995", "Java", "Cpp", "Python", "Csharp", "a");
        questions[1]=new Question(2, "size of int", "4 Bytes", "1 Bytes", "2 Bytes", "3 Bytes", "a");
        questions[2]=new Question(3, "size of double", "8 Bytes", "1 Bytes", "2 Bytes", "3 Bytes", "a");
        questions[3]=new Question(4, "size of char", "4 Bytes", "1 Bytes", "2 Bytes", "3 Bytes", "c");
        questions[4]=new Question(5, "size of boolean", "4 Bytes", "1 Bytes", "2 Bytes", "3 Bytes", "b");
        

    }
    public int validate(){
        int count=0;
        for(int i=0;i<5;i++){
            if(selection[i].equals(questions[i].getAnswer()))count++;
        }
        return count;
    }
    public void displayQuestions(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){        
            System.out.println(questions[i].getId()+"."+questions[i].getQuestion()+".\n"+"    a."+questions[i].getOpt1()+"    b."+questions[i].getOpt2()+"    c."+questions[i].getOpt3()+"    d."+questions[i].getOpt4());
            selection[i]=sc.next();
        }
        int res=validate();
        System.out.println("you score is:"+res);

    
    }
}