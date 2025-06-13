public class Logger {

    private volatile static Logger logger;

    private Logger() {

    }

    public static Logger getLogger(){
        if(logger!=null){
            return logger;
        }
        else{
            synchronized (Logger.class){
                if(logger==null){
                    logger = new Logger();
                }
                return logger;
            }
        }
    }

    public void log(String logs){
        System.out.println(logs);
    }

}
