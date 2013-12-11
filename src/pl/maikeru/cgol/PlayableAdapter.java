package pl.maikeru.cgol;

import pl.maikeru.cgol.coderetreat.WrongGame;

class PlayableAdapter implements Playable {
    
        private final WrongGame game;
        
        public static Playable createPlayable() {
            Playable playable = new PlayableAdapter(new WrongGame());
            return playable;
        }

        private PlayableAdapter(WrongGame yourGame) {
            this.game = yourGame;
            gameSetUp();
        }
        
        private void gameSetUp()
        {
            game.resetState();
        }

        @Override
        public Boolean[][] toArray() {
            return game.toArray();
        }

        @Override
        public void nextState() {
            game.nextState();
        }

        @Override
        public void resetState() {
            game.resetState();
        }
}
