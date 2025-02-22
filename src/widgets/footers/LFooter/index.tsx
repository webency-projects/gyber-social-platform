import React, {FC} from 'react'
import { MediumWorkmarkOutlined, AppleOutlined, RedditOutlined } from '@ant-design/icons'
import styles from './styles.module.scss'
import { Button } from 'antd'
import Icon, { CustomIconComponentProps } from '@ant-design/icons/lib/components/Icon'

export const LFooter:FC = () => {

    // const TelegramSvg = () => (
    //     <svg 
    //         fill="#ffffff" 
    //         viewBox="0 0 256 256" 
    //         id="Flat" 
    //         xmlns="http://www.w3.org/2000/svg" 
    //         transform="matrix(1, 0, 0, 1, 0, 0)" 
    //         stroke="#ffffff"
    //     >
    //             <g 
    //                 id="SVGRepo_bgCarrier" 
    //                 stroke-width="0">
    //             </g>
    //             <g 
    //                 id="SVGRepo_tracerCarrier" 
    //                 stroke-linecap="round" 
    //                 stroke-linejoin="round">
    //             </g>
    //             <g 
    //                 id="SVGRepo_iconCarrier"
    //             > 
    //                 <path 
    //                     d="M228.646,34.7676a11.96514,11.96514,0,0,0-12.21778-2.0752L31.87109,105.19729a11.99915,11.99915,0,0,0,2.03467,22.93457L84,138.15139v61.833a11.8137,11.8137,0,0,0,7.40771,11.08593,12.17148,12.17148,0,0,0,4.66846.94434,11.83219,11.83219,0,0,0,8.40918-3.5459l28.59619-28.59619L175.2749,217.003a11.89844,11.89844,0,0,0,7.88819,3.00195,12.112,12.112,0,0,0,3.72265-.59082,11.89762,11.89762,0,0,0,8.01319-8.73925L232.5127,46.542A11.97177,11.97177,0,0,0,228.646,34.7676ZM32.2749,116.71877a3.86572,3.86572,0,0,1,2.522-4.07617L203.97217,46.18044,87.07227,130.60769,35.47461,120.28811A3.86618,3.86618,0,0,1,32.2749,116.71877Zm66.55322,86.09375A3.99976,3.99976,0,0,1,92,199.9844V143.72048l35.064,30.85669ZM224.71484,44.7549,187.10107,208.88772a4.0003,4.0003,0,0,1-6.5415,2.10937l-86.1543-75.8164,129.66309-93.645A3.80732,3.80732,0,0,1,224.71484,44.7549Z">
    //                 </path> 
    //             </g>
    //     </svg>
    // )

    // const TelegramIcon = (props: Partial<CustomIconComponentProps>) => (
    //     <Icon component={TelegramSvg} {...props} />
    // );

    return (
        <footer className={styles.footer}>
            <div className={styles.wrap}>
                <Button 
                    className={styles.bttn}
                    type="dashed" 
                    shape="circle" 
                    // @ts-ignore
                    icon={ <MediumWorkmarkOutlined style={{ color: '#fff' }} />}
                    style={{ background: '#000' }}
                    size={'large'}
                    href={'https://themacroeconomicdao.medium.com/'}
                />
                {/* <Button 
                    className={styles.bttn}
                    type="dashed" 
                    shape="circle" 
                    icon={ <TelegramIcon style={{ color: '#fff' }} />}
                    style={{ background: '#000' }}
                    size={'large'}
                /> */}
                <Button 
                    className={styles.bttn}
                    type="dashed" 
                    shape="circle"
                    // @ts-ignore 
                    icon={ <RedditOutlined style={{ color: '#fff' }} />}
                    style={{ background: '#000' }}
                    size={'large'}
                    href={'https://www.reddit.com/r/Gybernaty/'}
                />
            </div>
        </footer>
    )
}
