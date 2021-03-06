package State;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Maka on 17.10.2017.
 */

public class StateManager {
        private Stack<State> states;

        public StateManager(){
            states = new Stack<State>();
        }

        public void push(State state){
            states.push(state);
        }

        public void pop(){
            states.pop().dispose();
        }

        public void set(State state){
            states.pop().dispose();
            states.push(state);
        }

        public void update(float dt){
            states.peek().update(dt);
        }

        public State peek(){
            return states.peek();
        }

        public void render(SpriteBatch sb){
            states.peek().render(sb);
        }
}

