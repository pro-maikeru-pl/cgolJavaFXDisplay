package pl.maikeru.cgol;

class PlayableAdapter implements Playable {
    
        private final DummyGameImplementation game;
        
        public static Playable createPlayable() {
            Playable playable = new PlayableAdapter(new DummyGameImplementation());
            return playable;
        }

        private PlayableAdapter(DummyGameImplementation yourGame) {
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
