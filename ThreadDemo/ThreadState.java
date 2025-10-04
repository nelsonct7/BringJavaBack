package ThreadDemo;

/*
 * new state => when thread started
 * runnable state => thread is ready for running
 * running state => thread is running in cpu
 * waiting state => thread is waiting for other threads to execute
 * dead state => thread is killed 
 * 
 *                                ---------------->t1.stop()------------------->t1.stop(){stop() method is deprecated}--->[Dead]
 *                               |                                       |
 *                               |                                       |
 *                               |                                       |
 * [new] --->t1.start()---->[runnable]----->t1.run()----->[running]----->----->t1.sleep()----->
 *                               ^                                       |                     |
 *                               |                                       |                     |--->[waiting]---->t1.notify()---->
 *                               |                                       |                     |                                  |
 *                               |                                       |---->t1.wait()------>                                   |
 *                               |                                                                                                |
 *                               |-------------------<---------------------------------<------------------------------------------|
 */

public class ThreadState {
    public static void main(String[] args) {
        /*
         * thread start from the NEW state, once the start() method is called, it goes to RUNNABLE state,
         * if the run() method is called it goes to RUNNING state, if stop() method is called it goes to DEAD state
         * when the thread is in RUNNING state, if the sleep() or wait() methods are called , the thread goes to WAITING state
         * when a thread is in WAITING state you need to call notify() method to make the thread move to RUNNABLE state
         * NOTE: you can directly move a thread from WAITING to RUNNING state.
         */
    }    
}
