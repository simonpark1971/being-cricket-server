package com.redspark.beingcricket.beingcricketserver.domain;

public class PlayerInnings {

    String date;
    String runs;
    String dismissalType;
    String caughtAt;
    String ballsFaced;
    String opposition;
    String team;
    String gameType;
    String username;

    public PlayerInnings(String date,
                         String runs,
                         String dismissalType,
                         String caughtAt,
                         String ballsFaced,
                         String opposition,
                         String team,
                         String gameType,
                         String username) {

        this.date = date;
        this.runs = runs;
        this.dismissalType = dismissalType;
        this.caughtAt = caughtAt;
        this.ballsFaced = ballsFaced;
        this.opposition = opposition;
        this.team = team;
        this.gameType = gameType;
        this.username = username;
    }

    private String getDate() {
        return date;
    }

    private void setDate(String date) {
        this.date = date;
    }

    private String getRuns() {
        return runs;
    }

    private void setRuns(String runs) {
        this.runs = runs;
    }

    private String getDismissalType() {
        return dismissalType;
    }

    private void setDismissalType(String dismissalType) {
        this.dismissalType = dismissalType;
    }

    private String getCaughtAt() {
        return caughtAt;
    }

    private void setCaughtAt(String caughtAt) {
        this.caughtAt = caughtAt;
    }

    private String getBallsFaced() {
        return ballsFaced;
    }

    private void setBallsFaced(String ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    private String getOpposition() {
        return opposition;
    }

    private void setOpposition(String opposition) {
        this.opposition = opposition;
    }

    private String getTeam() {
        return team;
    }

    private void setTeam(String team) {
        this.team = team;
    }

    private String getGameType() {
        return gameType;
    }

    private void setGameType(String gameType) {
        this.gameType = gameType;
    }

    private String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }
}
