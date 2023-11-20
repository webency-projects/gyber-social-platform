'use client'
import CountdownTimer from "./Timer/CoundownTimer";
import ProgressTimer from "./ProgressTimer/ProgressTimer";
import {useCountdown} from "@/shared/ui/CountdownTimer/hooks/useCountdown";
import {useEffect, useState} from "react";
import {NumericRange} from "@/shared/types/types";

interface CountdownTimerProps {
    isStopped: () => void;
    year: number;
    month: NumericRange<1, 12>;
    day: NumericRange<0, 31>;
    hour?: NumericRange<0, 23>
    minutes?: NumericRange<0, 59>;
}

const CountdownProgressTimer = (props: CountdownTimerProps) => {
    const {
        isStopped,
        year,
        month,
        day,
        hour = 0,
        minutes = 0
    } = props;

    const handle = (value: number) => (value < 10 ? "0" + value : value);
    const date = `${handle(year)}-${handle(month)}-${handle(day)}T${handle(hour)}:${handle(minutes)}:00`
    const {timer, timerStopped} = useCountdown(date)

    useEffect(() => {
        if (timerStopped) {
            isStopped();
        }
    }, [timerStopped, isStopped]);
    return (
        <>
            <CountdownTimer
                days={timer.days}
                hours={timer.hours}
                minutes={timer.minutes}
                seconds={timer.seconds} />
            <ProgressTimer
                initDays={day}
                days={timer.days}
                hours={timer.hours}
                minutes={timer.minutes}
                isStopped={timerStopped} />
        </>
    )
}

export default CountdownProgressTimer