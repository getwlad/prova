package prova2.models.species.enums;

public enum DeathCause {
    SIMPLE(100L),
    WORST(200L),
    NOWAY(500L);

    private final Long causeValue;

    DeathCause(Long causeValue) {
        this.causeValue = causeValue;
    }

    public Long getCauseValue() {
        return causeValue;
    }
}
