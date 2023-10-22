package Practice.Prac1.Carr.inter2;

public abstract class Tv {

    private String company; // 티비 회사
    private int channel = 1; // 현재 채널 상태
    private int volume = 0;  // 현재 볼륨 상태
    private boolean power = false; // 현재 전원 상태

    public Tv(String company) {
        this.company = company;
    }

    public void displayPower(String company, boolean power) {
        if(power) {
            System.out.println(company + " Tv 전원이 켜졌습니다.");
        } else {
            System.out.println(company + " Tv 전원이 종료되었습니다.");
        }
    }

    public void displayChannel(int channel) {
        System.out.println("현재 채널은 " + channel);
    }

    public void displayVolume(int volume) {
        System.out.println("현재 볼륨은 " + volume);
    }

    public String getCompany() {
        return company;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setChannel(int channel) {
        this.channel = Math.max(channel, 0);
    }

    public void setVolume(int volume) {
        this.volume = Math.max(volume, 0);
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}