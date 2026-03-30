import React from "react";

export default function MuseumExhibit() {
    return (
        <main className="min-h-screen text-zinc-50 font-sans selection:bg-white selection:text-black ">
            {/* Hero Section */}
            <section className="h-screen flex flex-col justify-center px-8 md:px-24 border-b border-zinc-800">
                <p className="text-zinc-500 tracking-widest uppercase text-sm font-bold mb-4">
                    Exhibition 01 // Digital History
                </p>
                <h1 className="text-7xl md:text-9xl font-black tracking-tighter mb-8 leading-none">
                    BEYOND <br /> BINARY.
                </h1>
                <p className="text-xl md:text-3xl font-light max-w-2xl text-zinc-400">
                    The evolution to quantum computing, from room-sized machines, to the microchip
                    revolution, and finally to the mind-bending reality of qubits.
                </p>
                <div className="mt-16 animate-bounce">
                    <p className="text-sm font-bold uppercase tracking-widest text-zinc-500">
                        Begin the Evolution ↓
                    </p>
                </div>
            </section>

            {/* Artifact 1: Moore's Law */}
            <section className="py-32 px-8 md:px-24 border-b border-zinc-800 grid grid-cols-1 md:grid-cols-2 gap-16 items-center z-10">
                <div>
                    <p className="text-6xl font-black text-zinc-800 mb-4">01</p>
                    <h2 className="text-4xl md:text-6xl font-bold tracking-tight mb-6">
                        The Blueprint.
                    </h2>
                    <h3 className="text-xl font-medium text-white mb-4">
                        Gordon E. Moore's 1965 Paper (IEEE)
                    </h3>
                    <p className="text-zinc-400 text-lg mb-8 leading-relaxed">
                        The original historical document where engineer Gordon Moore predicted that
                        the number of transistors on a microchip would double every year (later
                        revised to every two years). This became the famous "Moore's Law," which
                        acted as the guiding blueprint for the entire modern tech boom. It proves
                        that our massive technological evolution was driven by a continuous
                        shrinking process that is now finally reaching its limit.
                    </p>
                    <a
                        href="https://ieeexplore.ieee.org/document/4785860"
                        target="_blank"
                        rel="noreferrer"
                        className="inline-block border border-white px-8 py-3 text-sm font-bold uppercase tracking-widest hover:bg-white hover:text-black transition-colors"
                    >
                        View Original Document
                    </a>
                </div>
                <div className="aspect-square grayscale hover:grayscale-0 transition duration-700 overflow-hidden">
                    <img
                        src="https://images.unsplash.com/photo-1517077304055-6e89abbf09b0?q=80&w=2069&auto=format&fit=crop"
                        alt="Historical Engineering Blueprints"
                        className="w-full h-full object-cover"
                    />
                </div>
            </section>

            {/* Artifact 2: Intel 4004 */}
            <section className="py-32 px-8 md:px-24 border-b border-zinc-800 grid grid-cols-1 md:grid-cols-2 gap-16 items-center z-10">
                <div className="order-2 md:order-1 aspect-square grayscale hover:grayscale-0 transition duration-700 overflow-hidden">
                    <img
                        src="https://images.unsplash.com/photo-1555664424-778a1e5e1b48?q=80&w=2070&auto=format&fit=crop"
                        alt="Silicon Microchip"
                        className="w-full h-full object-cover"
                    />
                </div>
                <div className="order-1 md:order-2">
                    <p className="text-6xl font-black text-zinc-800 mb-4">02</p>
                    <h2 className="text-4xl md:text-6xl font-bold tracking-tight mb-6">
                        The Silicon Era.
                    </h2>
                    <h3 className="text-xl font-medium text-white mb-4">
                        The Intel 4004 Microprocessor (1971)
                    </h3>
                    <p className="text-zinc-400 text-lg mb-8 leading-relaxed">
                        Historical documentation, schematics, and imagery of the first commercially
                        produced microprocessor in 1971, which put an entire CPU on a single silicon
                        chip. This is the artifact that made personal computing and modern software
                        development possible. It is the bridge between the massive mainframes of the
                        past and the laptops we code on today.
                    </p>
                    <a
                        href="https://www.intel.com/content/www/us/en/history/virtual-vault/articles/the-intel-4004.html"
                        target="_blank"
                        rel="noreferrer"
                        className="inline-block border border-white px-8 py-3 text-sm font-bold uppercase tracking-widest hover:bg-white hover:text-black transition-colors"
                    >
                        Explore the Hardware
                    </a>
                </div>
            </section>

            {/* Artifact 3: Quantum Computing */}
            <section className="py-32 px-8 md:px-24 grid grid-cols-1 md:grid-cols-2 gap-16 items-center z-10">
                <div>
                    <p className="text-6xl font-black text-zinc-800 mb-4">03</p>
                    <h2 className="text-4xl md:text-6xl font-bold tracking-tight mb-6">
                        The Quantum Reality.
                    </h2>
                    <h3 className="text-xl font-medium text-white mb-4">IBM Quantum System One</h3>
                    <p className="text-zinc-400 text-lg mb-8 leading-relaxed">
                        IBM's official showcase and technical breakdown of the world's first
                        integrated quantum computer system designed for commercial use. It
                        represents the leap from traditional binary bits to quantum qubits. It shows
                        exactly where the future of computing is headed.
                    </p>
                    <a
                        href="https://research.ibm.com/quantum-computing"
                        target="_blank"
                        rel="noreferrer"
                        className="inline-block bg-white text-black px-8 py-3 text-sm font-bold uppercase tracking-widest hover:bg-zinc-300 transition-colors"
                    >
                        Enter the Quantum Era
                    </a>
                </div>
                <div className="aspect-square grayscale hover:grayscale-0 transition duration-700 overflow-hidden bg-zinc-900 flex items-center justify-center p-8">
                    <img
                        src="https://images.unsplash.com/photo-1635070041078-e363dbe005cb?q=80&w=2070&auto=format&fit=crop"
                        alt="Quantum Computing Chandelier"
                        className="w-full h-full object-cover"
                    />
                </div>
            </section>

            {/* Footer */}
            <footer className="py-12 px-8 text-center border-t border-zinc-800 text-zinc-600 text-sm font-medium tracking-widest uppercase z-10">
                <p>Curated by Roberto Rodriguez | IS 117 Midterm Project</p>
            </footer>
        </main>
    );
}
