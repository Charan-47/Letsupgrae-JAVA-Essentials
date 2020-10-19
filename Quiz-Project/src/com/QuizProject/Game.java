package com.QuizProject;

public class Game {

    Question[] questions = new Question[3];
    Player player = new Player();

    public void initGame()
    {
        for(int i =0;i < 3;i++)
        {
            questions[i] = new Question();
        }

        //applying values to the variables of the object

        questions[0].question = "Who is the strongest avenger ?";
        questions[0].option1 = "Ironman";
        questions[0].option2 = "Thor";
        questions[0].option3 = "Hulk";
        questions[0].option4 = "Dr.strange";
        questions[0].correctAnswer = 2;

        questions[1].question = "What is the closet planet to sun ?";
        questions[1].option1 = "Earth";
        questions[1].option2 = "Venus";
        questions[1].option3 = "Mercury";
        questions[1].option4 = "Jupyter";
        questions[1].correctAnswer = 3;

        questions[2].question = "what is capital of australia";
        questions[2].option1 = "Sydney";
        questions[2].option2 = "Melbourne";
        questions[2].option3 = "Perth";
        questions[2].option4 = "Canberra";
        questions[2].correctAnswer = 4;

    }
    public void play()
    {

        player.getDetails();
        for(int i =0;i < 3; i++)
        {
            boolean status = questions[i].askQuestion();
            if (status == true)
            {
                System.out.println("good answer");
                player.score++;
            }
            else
            {
                System.out.println("check your answer");
            }
        }

        System.out.println(player.name +" your score is  "+ player.score);
    }
}
