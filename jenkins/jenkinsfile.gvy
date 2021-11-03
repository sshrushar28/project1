pipeline {
    agent  any

    stages {
        stage{
            steps{
                echo "hello universe"
                echo "this is 3rd change"
            }
        }
    }

}