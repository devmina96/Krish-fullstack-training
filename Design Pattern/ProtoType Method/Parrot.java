public class Parrot extends Animal{
    private boolean canTalk;

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "canTalk=" + canTalk +
                '}';
    }
}
