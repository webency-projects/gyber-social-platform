import { classNames } from "@/shared/lib/classNames/classNames";
import cls from "./Header.module.scss";
import React from "react";
import { Button, ThemeButton } from "@/shared/ui/Button/Button";
import { Logo } from "@/shared/ui/Logo/Logo";
import { NavbarTablet } from "../Navbar";
import ExternalLink, { ThemeExternalLink } from "@/shared/ui/ExternalLink/ExternalLink";
import DownloadIcon from "@/shared/ui/SvgIcons/DownloadIcon/DownloadIcon";


interface HeaderProps {
  children?: React.ReactNode;
  className?: string;
}

export const Header = ({ className = "" }: HeaderProps) => {
  return (
    <div className={classNames(cls.Header, {}, [className])}>
      <Logo>Gyber</Logo>
      <div className={cls.btnGroup}>
        <ExternalLink 
          className={cls.isMobile}
          href="/documents/GYBER_White_paper_eng.pdf" 
          target="_blank"
          theme={ThemeExternalLink.CLEAR}>
            <span>PDF</span>
            <DownloadIcon/>
        </ExternalLink>
        <Button theme={ThemeButton.ORANGE} disabled>
          Dapp
        </Button>
        <NavbarTablet/>
      </div>
    </div>
  );
};
