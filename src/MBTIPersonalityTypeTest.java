import java.util.Scanner;

public class MBTIPersonalityTypeTest {
    public static void main(String[] args) {

        System.out.println("""
                \n
                MBTI Personality Test
                The following test is designed to measure your MBTI Personality type.\s
                Several hints about how to best complete this survey:
                x There are no right answers to any of these questions.
                x Answer the questions quickly, do not over-analyze them. Some seem worded poorly. Go with what feels best.
                x Answer the questions as “the way you are”, not “the way you’d like to be seen by others”
                x Do not look at the scoring sheet until you have completed all the questions.\s
                """);

        String q1 = """
                At a party do you:
                a. Interact with many, including strangers
                b. Interact with a few, known to you\s
                """;

        String q2 = """
                Are you more:
                a. Realistic than speculative
                b. Speculative than realistic\s
                """;

        String q3 = """
                Is it worse to:
                a. Have your “head in the clouds”
                b. Be “in a rut”\s
                """;

        String q4 = """
                Are you more impressed by:
                a. Principles
                b. Emotions
                """;

        String q5 = """
                Are more drawn toward the:
                a. Convincing
                b. Touching\s
                """;

        String q6 = """
                Do you prefer to work:
                a. To deadlines
                b. Just “whenever”\s
                """;

        String q7 = """
                Do you tend to choose:
                a. Rather carefully
                b. Somewhat impulsively\s
                """;

        String q8 = """
                At parties do you:
                a. Stay late, with increasing energy
                b. Leave early with decreased energy\s
                """;

        String q9 = """
                Are you more attracted to:
                a. Sensible people
                b. Imaginative people""";

        String q10 = """
                Are you more interested in:
                a. What is actual
                b. What is possible""";

        String q11 = """
                In judging others are you more swayed by:
                a. Laws than circumstances
                b. Circumstances than laws\s
                """;

        String q12 = """
                In approaching others is your inclination to be somewhat:
                a. Objective
                b. Personal\s
                """;

        String q13 = """
                Are you more:
                a. Punctual
                b. Leisurely\s
                """;

        String q14 = """
                Does it bother you more having things:
                a. Incomplete
                b. Completed\s
                """;

        String q15 = """
                In your social groups do you:
                a. Keep abreast of other’s happenings
                b. Get behind on the news\s
                """;

        String q16 = """
                In doing ordinary things are you more likely to:
                a. Do it the usual way
                b. Do it your own way\s
                """;

        String q17 = """
                Writers should:
                a. “Say what they mean and mean what they say”
                b. Express things more by use of analogy\s
                """;

        String q18 = """
                Which appeals to you more:
                a. Consistency of thought
                b. Harmonious human relationships\s
                """;

        String q19 = """
                Are you more comfortable in making:
                a. Logical judgments
                b. Value judgments\s
                """;

        String q20 = """
                Do you want things:
                a. Settled and decided
                b. Unsettled and undecided\s
                """;

        String q21 = """
                Would you say you are more:
                a. Serious and determined
                b. Easy-going\s
                """;

        String q22 = """
                In phoning do you:
                a. Rarely question that it will all be said
                b. Rehearse what you’ll say\s
                """;

        String q23 = """
                Facts:
                a. “Speak for themselves”
                b. Illustrate principles\s
                """;

        String q24 = """
                Are visionaries:
                a. somewhat annoying
                b. rather fascinating\s
                """;

        String q25 = """
                Are you more often:
                a. a cool-headed person
                b. a warm-hearted person
                """;

        String q26 = """
                Is it worse to be:
                a. unjust
                b. merciless\s
                """;

        String q27 = """
                Should one usually let events occur:
                a. by careful selection and choice
                b. randomly and by chance
                """;

        String q28 = """
                Do you feel better about:
                a. having purchased
                b. having the option to buy\s
                """;

        String q29 = """
                In company do you:
                a. initiate conversation
                b. wait to be approached\s
                """;

        String q30 = """
                Common sense is:
                a. rarely questionable
                b. frequently questionable\s
                """;

        String q31 = """
                Children often do not:
                a. make themselves useful enough
                b. exercise their fantasy enough\s
                """;

        String q32 = """
                In making decisions do you feel more comfortable with:
                a. standards
                b. feelings\s
                """;

        String q33 = """
                Are you more:
                a. firm than gentle
                b. gentle than firm\s
                """;

        String q34 = """
                Which is more admirable:
                a. the ability to organize and be methodical
                b. the ability to adapt and make do\s
                """;

        String q35 = """
                Do you put more value on:
                a. infinite
                b. open-minded
                """;

        String q36 = """
                Does new and non-routine interaction with others:
                a. stimulate and energize you
                b. tax your reserves
                """;

        String q37 = """
                Are you more frequently:
                a. a practical sort of person
                b. a fanciful sort of person\s
                """;

        String q38 = """
                Are you more likely to:
                a. see how others are useful
                b. see how others see
                """;

        String q39 = """
                Which is more satisfying:
                a. to discuss an issue thoroughly
                b. to arrive at agreement on an issue\s
                """;

        String q40 = """
                Which rules you more:
                a. your head
                b. your heart
                """;

        String q41 = """
                Are you more comfortable with work that is:
                a. contracted
                b. done on a casual basis\s
                """;

        String q42 = """
                Do you tend to look for:
                a. the orderly
                b. whatever turns up
                """;

        String q43 = """
                Do you prefer:
                a. many friends with brief contact
                b. a few friends with more lengthy contact\s
                """;

        String q44 = """
                Do you go more by:
                a. facts
                b. principles
                """;

        String q45 = """
                Are you more interested in:
                a. production and distribution
                b. design and research\s
                """;

        String q46 = """
                Which is more of a compliment:
                a. “There is a very logical person.”
                b. “There is a very sentimental person.”\s
                """;

        String q47 = """
                Do you value in yourself more that you are:
                a. unwavering
                b. devoted\s
                """;

        String q48 = """
                Do you more often prefer the:
                a. final and unalterable statement
                b. tentative and preliminary statement\s
                """;

        String q49 ="""
                Are you more comfortable:
                a. after a decision
                b. before a decision\s
                """;

        String q50 = """
                Do you:
                a. speak easily and at length with strangers
                b. find little to say to strangers
                """;

        String q51 = """
                Are you more likely to trust your:
                a. experience
                b. hunch\s
                """;

        String q52 = """
                Do you feel:
                a. more practical than ingenious
                b. more ingenious than practical
                """;

        String q53 = """
                Which person is more to be complimented one of:
                a. clear reason
                b. strong feeling
                """;

        String q54 = """
                Are you inclined more to be:
                a. fair-minded
                b. sympathetic\s
                """;

        String q55 = """
                Is it preferable mostly to:
                a. make sure things are arranged
                b. just let things happen\s
                """;

        String q56 = """
                In relationships should most things be:
                a. re-negotiable
                b. random and circumstantial\s
                """;

        String q57 = """
                When the phone rings do you:
                a. hasten to get to it first
                b. hope someone else will answer
                """;

        String q58 = """
                Do you prize more in yourself:
                a. a strong sense of reality
                b. a vivid imagination\s
                """;

        String q59 = """
                Are you drawn more to:
                a. fundamentals
                b. overtones\s
                """;

        String q60 = """
                Which seems the greater error:
                a. to be too passionate
                b. to be too objective
                """;

        String q61 = """
                Do you see yourself as basically:
                a. hard-headed
                b. soft-hearted\s
                """;

        String q62 = """
                Which situation appeals to you more:
                a. the structured and scheduled
                b. the unstructured and unscheduled\s
                """;

        String q63 = """
                Are you a person that is more:
                a. routinized than whimsical
                b. whimsical than routinized\s
                """;

        String q64 = """
                Are you more inclined to be:
                a. easy to approach
                b. somewhat reserved
                """;

        String q65 = """
                In writings do you prefer:
                a. the more literal
                b. the more figurative\s
                """;

        String q66 = """
                Is it harder for you to:
                a. identify with others
                b. utilize others\s
                """;

        String q67 = """
                Which do you wish more for yourself:
                a. clarity of reason
                b. strength of compassion\s
                """;

        String q68 = """
                Which is the greater fault:
                a. being indiscriminate
                b. being critical\s
                """;

        String q69 = """
                Do you prefer the:
                a. planned event
                b. unplanned event
                """;

        String q70 = """
                Do you tend to be more:
                a. deliberate than spontaneous
                b. spontaneous than deliberate\s
                """;

        Question[] questions = {
                new Question(q1),
                new Question(q2),
                new Question(q3),
                new Question(q4),
                new Question(q5),
                new Question(q6),
                new Question(q7),
                new Question(q8),
                new Question(q9),
                new Question(q10),
                new Question(q11),
                new Question(q12),
                new Question(q13),
                new Question(q14),
                new Question(q15),
                new Question(q16),
                new Question(q17),
                new Question(q18),
                new Question(q19),
                new Question(q20),
                new Question(q21),
                new Question(q22),
                new Question(q23),
                new Question(q24),
                new Question(q25),
                new Question(q26),
                new Question(q27),
                new Question(q28),
                new Question(q29),
                new Question(q30),
                new Question(q31),
                new Question(q32),
                new Question(q33),
                new Question(q34),
                new Question(q35),
                new Question(q36),
                new Question(q37),
                new Question(q38),
                new Question(q39),
                new Question(q40),
                new Question(q41),
                new Question(q42),
                new Question(q43),
                new Question(q44),
                new Question(q45),
                new Question(q46),
                new Question(q47),
                new Question(q48),
                new Question(q49),
                new Question(q50),
                new Question(q51),
                new Question(q52),
                new Question(q53),
                new Question(q54),
                new Question(q55),
                new Question(q56),
                new Question(q57),
                new Question(q58),
                new Question(q59),
                new Question(q60),
                new Question(q61),
                new Question(q62),
                new Question(q63),
                new Question(q64),
                new Question(q65),
                new Question(q66),
                new Question(q67),
                new Question(q68),
                new Question(q69),
                new Question(q70)
        };

        takeTest(questions);

    }

    public static void takeTest(Question[] questions) {
        StringBuilder personality = new StringBuilder();

        int countOfAs = 0;
        int countOfBs = 0;

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < questions.length; i+=7) {
            System.out.println(questions[i]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("a")){
                countOfAs++;
            }
            else{
                if (answer.equalsIgnoreCase("b")){
                    countOfBs++;
                }
                else{
                    System.out.println("Wrong input");
                    System.exit(-1);
                }
            }

        }

        if (countOfAs > countOfBs){
            personality.append("E ");
        }
        else{
            personality.append("I ");
        }

        countOfAs = 0;
        countOfBs = 0;

        for (int i = 1; i < questions.length; i+=7) {
            System.out.println(questions[i]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("a")){
                countOfAs++;
            }
            else{
                if (answer.equalsIgnoreCase("b")){
                    countOfBs++;
                }
                else{
                    System.out.println("Wrong input");
                    System.exit(-1);
                }
            }

        }


        for (int i = 2; i < questions.length; i+=7) {
            System.out.println(questions[i]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("a")){
                countOfAs++;
            }
            else{
                if (answer.equalsIgnoreCase("b")){
                    countOfBs++;
                }
                else{
                    System.out.println("Wrong input");
                    System.exit(-1);
                }
            }

        }
        if (countOfAs > countOfBs){
            personality.append("S ");
        }
        else{
            personality.append("N ");
        }

        countOfAs = 0;
        countOfBs = 0;


        for (int i = 3; i < questions.length; i+=7) {
            System.out.println(questions[i]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("a")){
                countOfAs++;
            }
            else{
                if (answer.equalsIgnoreCase("b")){
                    countOfBs++;
                }
                else{
                    System.out.println("Wrong input");
                    System.exit(-1);
                }
            }

        }


        for (int i = 4; i < questions.length; i+=7) {
            System.out.println(questions[i]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("a")){
                countOfAs++;
            }
            else{
                if (answer.equalsIgnoreCase("b")){
                    countOfBs++;
                }
                else{
                    System.out.println("Wrong input");
                    System.exit(-1);
                }
            }

        }

        if (countOfAs > countOfBs){
            personality.append("T ");
        }
        else{
            personality.append("F ");
        }

        countOfAs = 0;
        countOfBs = 0;


        for (int i = 5; i < questions.length; i+=7) {
            System.out.println(questions[i]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("a")){
                countOfAs++;
            }
            else{
                if (answer.equalsIgnoreCase("b")){
                    countOfBs++;
                }
                else{
                    System.out.println("Wrong input");
                    System.exit(-1);
                }
            }

        }

        for (int i = 6; i < questions.length; i+=7) {
            System.out.println(questions[i]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("a")){
                countOfAs++;
            }
            else{
                if (answer.equalsIgnoreCase("b")){
                    countOfBs++;
                }
                else{
                    System.out.println("Wrong input");
                    System.exit(-1);
                }
            }

        }
        if (countOfAs > countOfBs){
            personality.append("J ");
        }
        else{
            personality.append("P ");
        }

        countOfAs = 0;
        countOfBs = 0;


        System.out.println(personality);
    }

}