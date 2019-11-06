package xyz.fokion

interface IStepExecutor {
    int sh(String command)
    void error(String message)
}