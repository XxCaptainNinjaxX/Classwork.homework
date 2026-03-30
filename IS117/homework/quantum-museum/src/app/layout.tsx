import type { Metadata } from "next";
import { Geist, Geist_Mono } from "next/font/google";
import "./globals.css";
import SplashCursor from "../components/splashCursor";

const geistSans = Geist({
    variable: "--font-geist-sans",
    subsets: ["latin"],
});

const geistMono = Geist_Mono({
    variable: "--font-geist-mono",
    subsets: ["latin"],
});

export const metadata: Metadata = {
    title: "Quantum Museum",
    description: "Quantum Museum for IS 117",
};

export default function RootLayout({
    children,
}: Readonly<{
    children: React.ReactNode;
}>) {
    return (
        <html
            lang="en"
            className={`${geistSans.variable} ${geistMono.variable} h-full antialiased`}
        >
            <body className="min-h-full relative">
                <div className="fixed inset-0 z-0 bg-zinc-950" aria-hidden="true" />
                <SplashCursor />
                <div className="relative z-20 min-h-full flex flex-col">{children}</div>
            </body>
        </html>
    );
}
